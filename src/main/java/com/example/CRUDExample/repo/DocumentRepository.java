package com.example.CRUDExample.repo;

import com.example.CRUDExample.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.multipart.MultipartFile;

public interface DocumentRepository extends JpaRepository<Document,Long> {

}
