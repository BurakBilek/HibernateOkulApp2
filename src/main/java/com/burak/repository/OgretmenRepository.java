package com.burak.repository;

import com.burak.repository.entity.Ogretmen;
import com.burak.util.MyFactoryRepository;

public class OgretmenRepository extends MyFactoryRepository<Ogretmen,Long> {
    public OgretmenRepository() {
        super(new Ogretmen());
    }
}
