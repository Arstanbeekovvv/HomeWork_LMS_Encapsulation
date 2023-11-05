public class University {
    private String passport;
    private String certificateFromSchool;
    private String photo;
    private String information;
    private String passportParents;
    private String birthCertificate;

    public University(){
        this.passport = passport;
        this.certificateFromSchool = certificateFromSchool;
        this.photo = photo;
        this.information = information;
        this.passportParents = passportParents;
        this.birthCertificate = birthCertificate;
    };
    public String getPassword(){ return this.passport;}
    public String getCertificateFromSchool(){ return this.certificateFromSchool;}
    public String getPhoto(){ return this.photo;}
    public String getInformation(){ return this.information;}
    public String getPasswordParents(){ return this.passportParents;}
    public String getBirthCertificate(){ return this.birthCertificate;}

    public void setPassport(String passport){ this.passport = passport;}
    public void setCertificateFromSchool(String certificateFromSchool){ this.certificateFromSchool = certificateFromSchool;}
    public void setPhoto(String photo){ this.photo = photo;}
    public void setInformation(String information){ this.information = information;}
    public void setPassportParents(String passportParents){ this.passportParents = passportParents;}
    public void setBirthCertificate(String birthCertificate){ this.birthCertificate = birthCertificate;}

}
