package xws.team16.requestservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xws.team16.requestservice.model.Ad;

@Repository
public interface AdRepository extends JpaRepository<Ad, Long> {
}
