package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.Style;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StyleDao extends JpaRepository<Style, Long> {
}
