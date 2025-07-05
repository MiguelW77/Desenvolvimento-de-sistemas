    package com.example.BancoImagensAPI.repository;

    import org.springframework.data.jpa.repository.JpaRepository;
    import org.springframework.stereotype.Repository;

    import com.example.BancoImagensAPI.model.imagesmodel;

    @Repository
    public interface imagesrepository extends JpaRepository<imagesmodel , Long> {

    }
