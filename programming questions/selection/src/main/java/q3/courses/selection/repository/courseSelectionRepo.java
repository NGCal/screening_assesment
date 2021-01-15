package q3.courses.selection.repository;
//This JP2 in memory database will mock a connection to a database

import q3.courses.selection.model.coursesSelection;

import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface courseSelectionRepo extends JpaRepository<coursesSelection,Long>{
   
}