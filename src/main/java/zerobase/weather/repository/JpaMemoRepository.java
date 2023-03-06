package zerobase.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zerobase.weather.domain.Memo;

//jdbcMemoRepository에 나와있는 코드들은 JpaRepository에 이미 저장되어있어서 따로 기재 X
@Repository
public interface JpaMemoRepository extends JpaRepository<Memo, Integer> {
    
}
