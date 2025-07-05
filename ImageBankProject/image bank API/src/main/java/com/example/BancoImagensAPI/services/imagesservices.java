    package com.example.BancoImagensAPI.services;

    import java.util.List;


    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;

    import com.example.BancoImagensAPI.model.imagesmodel;
    import com.example.BancoImagensAPI.repository.imagesrepository;

    @Service
    public class imagesservices {

        @Autowired
        imagesrepository repositorio;

        public  imagesmodel salvarimg(imagesmodel image ){
            return repositorio.save(image);
        }

        public imagesmodel buscarimgid(Long id){
            return repositorio.findById(id)
            .orElseThrow(() -> new RuntimeException("Imagem não encontrada"));
        }
        
        public List<imagesmodel> listarImages(){
            return repositorio.findAll();
            }
    public imagesmodel atualizarimg(Long id, imagesmodel imagemAtt){
        imagesmodel imagemexits = buscarimgid(id);

        imagemexits.setNome(imagemAtt.getNome());
        imagemAtt.setUrl(imagemAtt.getUrl());

        return repositorio.save(imagemexits);

    }
    public void deletarimg(Long id){
        if(!repositorio.existsById(id)){
            throw new RuntimeException("Imagem não encontrada para deletar!");
    }
    repositorio.deleteById(id);
    }
            
    }
