package com.burak;


import com.burak.repository.entity.*;
import com.burak.util.HibernateUtility;
import com.burak.util.MyFactoryRepository;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Session session ;
        Transaction transaction ;
        session= HibernateUtility.getSessionFactory().openSession();
        transaction=session.beginTransaction();
        MyFactoryRepository<Ogrenci,Long> ogrenciRepository= new MyFactoryRepository<>(new Ogrenci());
        ogrenciRepository.findAll();
        Long id=1L;
        System.out.println(ogrenciRepository.findById(id));
        System.out.println("Diger Asama");

        MyFactoryRepository<Ogretmen,Long>ogretmenList= new MyFactoryRepository<>(new Ogretmen());
        ogretmenList.findAll();
        System.out.println(ogretmenList.findById(id));

        System.out.println("Diger Asama");

        MyFactoryRepository<Sinif,Long>sinifList= new MyFactoryRepository<>(new Sinif());
        sinifList.findAll();
        System.out.println(sinifList.findById(id));
    }
}

    /*
    public static void main(String[] args) {
        Session session = HibernateUtility.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Ogretmen ogretmen = Ogretmen.builder()
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Alperen")
                        .soyisim("Ikinci")
                        .tcKimlik("1564789")

                        .build())
                .brans(EBrans.FIZIK)
//                .iseBaslamaTarihi(LocalDate.of(2022,01,15))
                .build();
        session.save(ogretmen);
        Ogrenci ogrenci = Ogrenci.builder()
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Banu")
                        .soyisim("Yilmaz")
                        .tcKimlik("12345")
                        .build())
                .build();
        Ogrenci ogrenci2 = Ogrenci.builder()
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Ahmet")
                        .soyisim("Kaya")
                        .tcKimlik("123456")
                        .build())

                .dogumTarihi(LocalDate.of(1990,10,10))
                .build();
        Sinif sinif = Sinif.builder()
                .sinifAdi("Kelebekler Sinifi")
                .ogretmenId(ogretmen.getId())
                .ogrenciler(List.of(
                        ogrenci.getKisiselBilgiler().getIsim(),
                        ogrenci2.getKisiselBilgiler().getIsim()
                ))
                .build();

        session.save(ogrenci);
        session.save(ogrenci2);
        session.save(sinif);
        transaction.commit();
        session.close();


    }
}
*/
/*
    public static  void main(String[] args) {
        Session session ;
        Transaction transaction ;
        session= HibernateUtility.getSessionFactory().openSession();
        transaction=session.beginTransaction();

        Ogretmen ogretmen= Ogretmen.builder()
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Alperen")
                        .soyisim("İkinci")
                        .tcKimlik("20523451341")
                        .build())

                .brans(EBrans.MATEMATIK)
                .iseBaslama(LocalDate.of(2020,9,29))
                .build();


        KisiselBilgiler kisiselBilgiler = KisiselBilgiler.builder()
                .isim("Burak")
                .soyisim("Bilek")
                .tcKimlik("24365235571538")
                .build();

        KisiselBilgiler kisiselBilgiler1=KisiselBilgiler.builder()
                .isim("Alperen")
                .soyisim("Ikinci")
                .tcKimlik("63475674538")
                .build();

        Ogrenci ogrenci= Ogrenci.builder()
                .kisiselBilgiler(kisiselBilgiler)
                .dogumTarihi(LocalDate.of(1998,8,13))
                .build();

        Ogretmen ogretmen1= Ogretmen.builder()
                .brans(EBrans.MATEMATIK)
                .iseBaslama(LocalDate.of(2020,8, 14))
                .kisiselBilgiler(kisiselBilgiler)
                .build();

        session.save(ogretmen);
        session.save(ogrenci);

        Sinif sinif= Sinif.builder()
                .sinifAdi("MF")
                .ogretmenId(1L)
                .ogrenciler(Arrays.asList(ogrenci.getKisiselBilgiler().getIsim()))
                .build();

        session.save(ogretmen);
        transaction.commit();
        session.close();
    }
}

 */
