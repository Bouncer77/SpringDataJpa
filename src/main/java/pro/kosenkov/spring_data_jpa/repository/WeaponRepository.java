package pro.kosenkov.spring_data_jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pro.kosenkov.spring_data_jpa.entity.Weapon;

@Repository
public interface WeaponRepository extends JpaRepository<Weapon, Long> {
    Weapon findByNameAndStartDateLessThanEqualAndEndDateGreaterThanEqual(String name, long curDate1, long curDate2);
}
