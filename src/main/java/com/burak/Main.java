package com.burak;


import com.burak.controller.OgrenciController;
import com.burak.controller.OgretmenController;
import com.burak.repository.entity.*;
import com.burak.repository.hql.OgrenciDao;
import com.burak.service.OgrenciService;
import com.burak.util.DataGenerator;
import com.burak.util.HibernateUtility;
import com.burak.util.MyFactoryRepository;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Session session = HibernateUtility.getSessionFactory().openSession();
//        Transaction transaction = session.beginTransaction();
//        Ogretmen ogretmen = Ogretmen.builder()
//                .kisiselBilgiler(KisiselBilgiler.builder()
//                        .isim("Alperen")
//                        .soyisim("Ikinci")
//                        .tcKimlikNo("1564789")
//                        .build())
//                .brans(EBrans.FIZIK)
////                .iseBaslamaTarihi(LocalDate.of(2022,01,15))
//                .build();
//        session.save(ogretmen);
//        Ogrenci ogrenci = Ogrenci.builder()
//                .kisiselBilgiler(KisiselBilgiler.builder()
//                        .isim("Banu")
//                        .soyisim("Yilmaz")
//                        .tcKimlikNo("12345")
//                        .build())
//                .build();
//        Ogrenci ogrenci2 = Ogrenci.builder()
//                .kisiselBilgiler(KisiselBilgiler.builder()
//                        .isim("Ahmet")
//                        .soyisim("Kaya")
//                        .tcKimlikNo("123456")
//                        .build())
//
//                .dogumTarihi(LocalDate.of(1990,10,10))
//                .build();
//        Sinif sinif = Sinif.builder()
//                .sinifAdi("Kelebekler Sinifi")
//                .ogretmenId(ogretmen.getId())
//                .ogrenciler(List.of(
//                        ogrenci.getKisiselBilgiler().getIsim(),
//                        ogrenci2.getKisiselBilgiler().getIsim()
//                ))
//                .build();
//
//        session.save(ogrenci);
//        session.save(ogrenci2);
//        session.save(sinif);
//        transaction.commit();
//        session.close();
//        OgrenciCriteria ogrenciCriteria = new OgrenciCriteria();
//        Ogrenci ogrenci = ogrenciCriteria.findById(1L);
//        List<Ogrenci> ogrenciList = ogrenciCriteria.findAll();
//        System.out.println("Tekli ogrenci (findById : " + ogrenci);
//        System.out.println("######################################");
//        ogrenciList.forEach(x -> System.out.println(x));

//        OgretmenCriteria ogretmenCriteria = new OgretmenCriteria();
//        Ogretmen ogretmen = ogretmenCriteria.findById(1L);
//        List<Ogretmen> ogretmenList = ogretmenCriteria.findAll();
//        System.out.println("Tekli ogretmen (findById : " + ogretmen);
//        System.out.println("######################################");
//        ogretmenList.forEach(x -> System.out.println(x));

        Session session ;
        Transaction transaction ;
        session= HibernateUtility.getSessionFactory().openSession();
        transaction=session.beginTransaction();

        OgrenciService ogrenciService;

        KisiselBilgiler kisiselBilgiler= KisiselBilgiler.builder()
                .tcKimlik("465465465")
                .isim("Abuzer")
                .soyisim("Komurcu")
                .build();

        Ogretmen ogretmen1=Ogretmen.builder()
                .kisiselBilgiler(kisiselBilgiler)
                .brans(EBrans.KIMYA)
                .iseBaslama(LocalDate.of(2002,4,12))
                .build();

        OgretmenController ogretmenController = new OgretmenController();

        // ogretmenController.save(ogretmen1);

        DataGenerator dataGenerator = new DataGenerator();
//        dataGenerator.ogrenciOlustur();
        dataGenerator.ogretmenOlustur();

//        session.save(ogrenci);
//        transaction.commit();
//        session.close();



//        OgrenciDao ogrenciDao = new OgrenciDao();
//        List<Ogrenci> ogrenciList = ogrenciDao.findAll2();
//        ogrenciList.stream().forEach(x-> System.out.println(x));
//        System.out.println(ogrenciDao.findById2(1L));

    }
}
     /*   OgretmenCriteria ogretmenCriteria = new OgretmenCriteria();
        Ogretmen ogretmen = ogretmenCriteria.findById(1L);
        List<Ogretmen> ogretmenList = ogretmenCriteria.findAll();
        System.out.println("Tekli ogretmen (findById : " + ogretmen);
        System.out.println("######################################");
        ogretmenList.forEach(x -> System.out.println(x));
*/


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
