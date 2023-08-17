package com.willpower.api.repository;

import com.willpower.api.entity.MagicConch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MagicConchRepository extends JpaRepository<MagicConch, Long> {

}
