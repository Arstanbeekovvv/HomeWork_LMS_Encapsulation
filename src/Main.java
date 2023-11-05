import java.util.Scanner;

import static java.lang.StringTemplate.STR;

public class Main {
    public static void main(String[] args) {
        University kyrgyz = new University();
        kyrgyz.setPassport("1. Жарандык (загран) паспорт ");
                kyrgyz.setCertificateFromSchool("2. 11 класстын аттестаты ");
                kyrgyz.setPhoto("3. 1 даана 4х6 тустуу фото ");
                kyrgyz.setInformation("4. Соттолбогондугу тууралу маалымат");
                kyrgyz.setPassportParents("5. Ата-энесинин паспрту ");
                kyrgyz.setBirthCertificate("6. Туулгандыгы тууралуу куболук ");
        University russ = new University();
                russ.setPassport("1. Паспорт гражданина (заграничного)");
                russ.setCertificateFromSchool("2. Аттестат за 11 класс ");
                russ.setPhoto("3. 1 цветная фотография 4х6");
                russ.setInformation("4. Сведения о несудимости");
                russ.setPassportParents("5. Паспорта родителей");
                russ.setBirthCertificate("6. Свидетельство о рождении");
        University english = new University();
                english.setPassport("1. Citizen (Foreign) Passport");
                english.setCertificateFromSchool("2. 11th grade certificate");
                english.setPhoto("3. 1 peaces 4x6 color photo");
                english.setInformation("4. Information about not having been convicted");
                english.setPassportParents("5. Passport of parents");
                english.setBirthCertificate("6. Birth Certificate");

        School kyrgyzSchool = new School("1. Мектеп жетекчилигинин атына ата-энесинин биринин арызы; ",
                "2. Баланын туулгандыгы тууралуу күбөлүгүнүн көчүрмөсү; ",
                "3. Ата-энесинин биринин же баланы караган мыйзамдуу өкүлдүн паспортунун көчүрмөсү; ",
                "4. Ден соолугунун абалы тууралуу медициналык маалым кат (Ф-26); ",
                "5. Баланын эмделгендиги тууралуу медициналык маалым кат (Ф-63); ",
                "6. баланы мектепке киргизүүдө ден соолугунун абалы тууралуу медициналык маалым кат; ",
                "7. 3x4 сүрөт ");
        School russianSchool = new School("1. Заявление одного из родителей в руководство школы;",
                 "2. Копия свидетельства о рождении ребенка;",
                 "3. Копия паспорта одного из родителей или законного представителя, осуществляющего уход за ребенком;",
        "4. Медицинская справка о состоянии здоровья (Ф-26); ",
                 "5. Медицинская справка о вакцинации ребенка (Ф-63);",
                 "6. медицинская справка о состоянии здоровья ребенка при поступлении в школу", "7. фото 3х4");
        School enlgischSchool = new School("1. Application of one of the parents to the school management; ",
                "2. Copy of the child's birth certificate; ",
                "3. A copy of the passport of one of the parents or the legal representative who takes care of the child; ",
                "4. Medical certificate on health condition (F-26); ",
                "5. Medical certificate about vaccination of the child (F-63); ",
                "6. medical certificate about the health condition of the child when entering school; ",
                "7. 3x4 photo");

        CarSchool kyrgyzCarSchool = new CarSchool();
            kyrgyzCarSchool.setCopyPassport("1. Паспорттун көчүрмөсү; ");
            kyrgyzCarSchool.setPhoto("1. Сүрөт 3*4 4 даана; ");
            kyrgyzCarSchool.setSpravkaForm86FromHospital("3. 83 формадагы медициналык справка; ");
        CarSchool russianCarSchool = new CarSchool();
            russianCarSchool.setCopyPassport("1. Паспорт копия; ");
            russianCarSchool.setPhoto("2. Фото 3*4 4 шт; ");
            russianCarSchool.setSpravkaForm86FromHospital("3. Медицинская справка форма 83; ");
        CarSchool englischCarSchool = new CarSchool();
            englischCarSchool.setCopyPassport("1. Passport copy; ");
            englischCarSchool.setPhoto("2. Photo 3*4 4 pcs;");
            englischCarSchool.setSpravkaForm86FromHospital("3. Medical certificate form 83;");

        University[] universities = {kyrgyz, russ, english};
        School[] schools = {kyrgyzSchool, russianSchool, enlgischSchool};
        CarSchool[] carSchools = {kyrgyzCarSchool, russianCarSchool, englischCarSchool};
        System.out.print("Кыргыз тили: 1 \nРусский язык: 2 \nEnglish language: 3 \nYour choice? ");
        int myChoice = new Scanner(System.in).nextInt();
        for (int i = 0; i < 3; i++) {
            if(i == myChoice-1) {
                System.out.println(STR."""

                            For Universities
                        \{universities[i].getPassword()}
                        \{universities[i].getCertificateFromSchool()}
                        \{universities[i].getPhoto()}
                        \{universities[i].getInformation()}
                        \{universities[i].getPasswordParents()}
                        \{universities[i].getBirthCertificate()}
                        """);
                System.out.println(STR."""
                            For Schools
                        \{schools[i].getApplicationFromParents()}
                        \{schools[i].getCopyBirthCertificate()}
                        \{schools[i].getCopyPassport()}
                        \{schools[i].getForm26()}
                        \{schools[i].getForm63()}
                        \{schools[i].getMedicalInformationForKind()}
                        \{schools[i].getPhoto()}
                        """);
                System.out.println(STR."""
                            For CarChools
                        \{carSchools[i].getCopyPassport()}
                        \{carSchools[i].getPhoto()}
                        \{carSchools[i].getSpravkaForm86FromHospital()}
                        """);
            }
        }
        Person person1 = new Person("Arstanbekov", "Mirlan", 2002, 04,07, "Kyrgyzstan", "20704200200788");
        Person person2 = new Person("Arslanbekov", "Mirbek", 2003, 05,06, "America", "20704200200788");
        Person person3 = new Person("Anarbaev", "Milan", 2004, 06,05, "Deutschland", "20704200200788");
        Person[] persons = {person1, person2, person3};
        for (Person person : persons) {
            System.out.println(person.getLastName() +"\n"+ person.getFirstName() + "\n" + person.getBirthOfYear() + "-" + person.getBirthOfMonth() + "-" + person.getBirthOfDay() + "\n" +
                    person.getCountry() + "\n" + person.getINN() + "\n");
        }

    }
}