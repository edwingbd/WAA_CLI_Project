//package edu.mum.client.repository;
//
//import edu.mum.client.domain.Block;
//import edu.mum.client.domain.Block;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//
//import java.time.LocalDate;
//import java.util.Optional;
//
//@Repository
//public interface BlockRepository extends JpaRepository<Block, Long> {
//	@Query("select o from Block o where o.startDate<=?1 and o.endDate>=?1")
//	Optional<Block> findCurrentBlock(LocalDate date);
//}
