
public class CheckMembershipCtrl {
    private TeamDAO teamDAO;

    public CheckMembershipCtrl() {
        teamDAO = new TeamDAO();
    }

    // complete the checkMembershipDuration method here
    public int checkMembershipDuration(String studentName, String teamName) {
        int retVal = -1;
        try {
            Team retTeam = teamDAO.retrieve(teamName);
            TMSDate dateFormed = retTeam.getDateFormed();
            Student retStudent = retTeam.retrieve(studentName);
            TMSDate studentJoined = retStudent.getDateJoined();
            retVal = studentJoined.calculateDifference(dateFormed);
        } catch (Exception e) {
            return retVal;
        }
        return retVal;
    }

}
