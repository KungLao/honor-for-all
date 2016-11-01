package com.honor.forall.dao;

import java.util.Set;

import com.honor.forall.enums.HeroField;
import com.honor.forall.model.base.Hero;
import com.honor.forall.model.vm.HeroVm;

public interface HeroDao {

    Set<HeroVm> getHeroes(Set<Integer> heroIds, Set<Hero.Class> heroClasses, Set<HeroField> heroFields);
}
