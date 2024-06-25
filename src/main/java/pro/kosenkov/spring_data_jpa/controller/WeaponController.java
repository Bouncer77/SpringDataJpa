package pro.kosenkov.spring_data_jpa.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.kosenkov.spring_data_jpa.entity.Weapon;
import pro.kosenkov.spring_data_jpa.repository.WeaponRepository;

import java.util.List;

@RequestMapping("api/v1")
@RestController
@RequiredArgsConstructor
public class WeaponController {

    private final WeaponRepository repository;

    @GetMapping(value = "/weapons")
    public List<Weapon> getAllWeapons() {
        return repository.findAll();
    }

    @GetMapping(value = "/kit_start")
    public String insertTestWeapons() {
        // Sat Jun 25 2022 14:47:16 GMT+0300 (Москва, стандартное время) = 1656157636
        // Tue Jun 25 2024 14:47:16 GMT+0300 (Москва, стандартное время) = 1719316036
        // Fri Jun 25 2027 14:47:16 GMT+0300 (Москва, стандартное время) = 1813924036
        Weapon shotgun = new Weapon(1L, "MP-133", 1656157636, 1813924036);
        Weapon traumaticPistol = new Weapon(2L, "Травматический пистолет МР-79-9 ТМ (кал.9мм Р.А.)", 1656157636, 1719316036);
        List<Weapon> kitStart = List.of(shotgun, traumaticPistol);
        repository.saveAll(kitStart);
        return "Шалость удалась";
    }
}
