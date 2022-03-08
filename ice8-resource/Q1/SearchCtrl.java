public class SearchCtrl {
    private InterestGroupDAO IGDM;

    public SearchCtrl() {
        IGDM = new InterestGroupDAO();
    }

    public Student searchPresident(String IGName, int year) {
        Student resStudent = null;
        InterestGroup retIG = IGDM.retrieve(IGName);
        if (retIG != null) {
            resStudent = retIG.retrievePresidentInYear(year);
        }
        return resStudent;
    }
}
