package org.example.notesapi.repository;

import org.example.notesapi.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface NoteRepository extends JpaRepository<Note, Long> {

    }

