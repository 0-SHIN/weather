package zerobase.weather.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zerobase.weather.domain.DateWeather;

import java.time.LocalDate;

public interface DateWeatherRepository extends JpaRepository<DateWeather, LocalDate> {
    DateWeather findByDate(LocalDate date);
}
