package com.advocacia.api.services;

import java.util.Optional;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.advocacia.api.domain.archive.Archive;

public interface IArchiveService {

    Archive findByPath(String path);
    Optional<Archive> findById(Long id);
    Archive sendDocument(MultipartFile archive, String archiveName);
    Archive saveModel(MultipartFile archive);
    void deleteById(Long id);
    List<Archive> findAllModel();
    String readArchive(String name);

    boolean archiveExists(String name);
}
