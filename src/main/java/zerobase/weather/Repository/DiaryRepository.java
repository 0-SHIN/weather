package zerobase.weather.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import zerobase.weather.domain.Diary;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface DiaryRepository extends JpaRepository<Diary, Integer> {
    List<Diary> findByDate(LocalDate date);

    List<Diary> findAllByDateBetween(LocalDate dateAfter, LocalDate dateBefore);

    Diary findFirstByDate(LocalDate date);

    @Transactional
    void deleteAllByDate(LocalDate date);
}
