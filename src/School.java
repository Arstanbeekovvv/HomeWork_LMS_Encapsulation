
public class School {
    private String applicationFromParents;
    private String copyBirthCertificate;
    private String copyPassport;
    private String form26;
    private String form63;
    private String medicalInformationForKind;
    private String photo;

    public School(String applicationFromParents, String copyBirthCertificate, String copyPassport, String form26, String form63, String medicalInformationForKind, String photo) {
        this.applicationFromParents = applicationFromParents;
        this.copyBirthCertificate = copyBirthCertificate;
        this.copyPassport = copyPassport;
        this.form26 = form26;
        this.form63 = form63;
        this.medicalInformationForKind = medicalInformationForKind;
        this.photo = photo;
    }

    public String getApplicationFromParents() {
        return applicationFromParents;
    }

    public void setApplicationFromParents(String applicationFromParents) {
        this.applicationFromParents = applicationFromParents;
    }

    public String getCopyBirthCertificate() {
        return copyBirthCertificate;
    }

    public void setCopyBirthCertificate(String copyBirthCertificate) {
        this.copyBirthCertificate = copyBirthCertificate;
    }

    public String getCopyPassport() {
        return copyPassport;
    }

    public void setCopyPassport(String copyPassport) {
        this.copyPassport = copyPassport;
    }

    public String getForm26() {
        return form26;
    }

    public void setForm26(String form26) {
        this.form26 = form26;
    }

    public String getForm63() {
        return form63;
    }

    public void setForm63(String form63) {
        this.form63 = form63;
    }

    public String getMedicalInformationForKind() {
        return medicalInformationForKind;
    }

    public void setMedicalInformationForKind(String medicalInformationForKind) {
        this.medicalInformationForKind = medicalInformationForKind;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

}
