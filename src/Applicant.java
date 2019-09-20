import java.util.HashSet;

public class Applicant {

    private String name;
    private String emailAddress;
    private Education education;
    private WorkExperience workExperience;
    private Skill skill;

    HashSet<Applicant> applicants;

    public Applicant(){
        applicants = new HashSet<>();
    }

    public Applicant(String name, String emailAddress, Education education, WorkExperience workExperience, Skill skill) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.education = education;
        this.workExperience = workExperience;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public WorkExperience getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(WorkExperience workExperience) {
        this.workExperience = workExperience;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public HashSet<Applicant> getApplicants() {
        return applicants;
    }

    public void setApplicants(HashSet<Applicant> applicants) {
        this.applicants = applicants;
    }

    // method to add new applicants in HashSet of applicants
    public void addApplicant(Applicant newApplicant){
        this.applicants.add(newApplicant);
    }

    public void displayApplicant(){
        for(Applicant applicant : this.getApplicants()){
            System.out.println("===========================================");
            System.out.println(applicant.getName());
            System.out.println(applicant.getEmailAddress());

            System.out.println("\nEducation");
            System.out.println("-----------");
            applicant.education.displayEducation();

            System.out.println("\nExperience");
            System.out.println("-----------");
            applicant.workExperience.displayExperience();

            System.out.println("\nSkills");
            System.out.println("-----------");
            applicant.skill.displaySkill();
        }
    }
}
