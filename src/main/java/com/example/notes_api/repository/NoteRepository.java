package com.example.notes_api.repository;

import com.example.notes_api.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for managing Note entities.
 * Provides CRUD operations for the Note entity.
 */
@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
}
