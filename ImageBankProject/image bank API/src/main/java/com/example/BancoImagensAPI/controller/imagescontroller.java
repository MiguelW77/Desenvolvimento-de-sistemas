    package com.example.BancoImagensAPI.controller;

    import java.util.List;


    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.http.HttpStatus;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.CrossOrigin;
    import org.springframework.web.bind.annotation.DeleteMapping;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.PathVariable;
    import org.springframework.web.bind.annotation.PostMapping;
    import org.springframework.web.bind.annotation.PutMapping;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RestController;
    import org.springframework.web.bind.annotation.RequestBody;
    import com.example.BancoImagensAPI.model.imagesmodel;
    import com.example.BancoImagensAPI.services.imagesservices;


    import lombok.NoArgsConstructor;

    @NoArgsConstructor
    @RestController
@CrossOrigin(origins = "*")
    @RequestMapping("/api/imagens")
    public class imagescontroller {

        @Autowired
        private imagesservices service;

        @GetMapping
        public List<imagesmodel> listarImages(){
            return service.listarImages();
            
        }
        @GetMapping("/{id}")
        public ResponseEntity<imagesmodel> buscarfid(@PathVariable Long id){
            try{
                imagesmodel image = service.buscarimgid(id);
                return ResponseEntity.ok(image);
            }catch(RuntimeException e ){
                return  ResponseEntity.notFound().build();
            }
        }
        @PostMapping
        public ResponseEntity<?> salvarimg(@RequestBody imagesmodel imagem){
            System.out.println("Imagem recebida: " + imagem.getNome());
            System.out.println("URl recebida: " + imagem.getUrl());
            try{imagesmodel imagesalva = service.salvarimg(imagem);
            return ResponseEntity.status(HttpStatus.CREATED).body(imagesalva);
        } catch(Exception e){
           System.out.println("Erro ao salvar imagem: " + e.getMessage());
           return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
           .body("Erro interno ao salvar a imagem.");
            }
    }
        @PutMapping("/{id}") 
        public ResponseEntity<imagesmodel> atualizimg(@PathVariable Long id, @RequestBody imagesmodel image){
            try{
                imagesmodel imageatualizada = service.atualizarimg(id, image);
                return ResponseEntity.ok(imageatualizada);

            }catch(RuntimeException e){
                return ResponseEntity.notFound().build();
            }
        }
            @DeleteMapping("/{id}") 
            ResponseEntity<Void> deletaimg(@PathVariable Long id){
                try{
                    service.deletarimg(id);
                    return ResponseEntity.noContent().build();

                }catch(RuntimeException e ){
                    return ResponseEntity.notFound().build();
                }
            } 


            

            
        }

