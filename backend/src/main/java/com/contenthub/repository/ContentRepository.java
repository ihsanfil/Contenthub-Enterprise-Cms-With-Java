package com.contenthub.repository;
import com.contenthub.domain.Content;import org.springframework.data.jpa.repository.JpaRepository;import java.util.List;
public interface ContentRepository extends JpaRepository<Content,Long>{List<Content> findAllByOrderByCreatedAtDesc();List<Content> findByStatusOrderByCreatedAtDesc(String status);boolean existsBySlug(String slug);}