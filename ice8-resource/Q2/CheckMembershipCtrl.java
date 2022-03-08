
public class CheckMembershipCtrl {
    private TeamDAO teamDAO;

    public CheckMembershipCtrl() {
        teamDAO = new TeamDAO();
    }

    // complete the checkMembershipDuration method here
    public int checkMembershipDuration(String studentName, String teamName) {
        int retVal = -1;

        Team retTeam = teamDAO.retrieve(teamName);
        if (retTeam == null) {
            return -1;
        }

        TMSDate dateFormed = retTeam.getDateFormed();

        Student retStudent = retTeam.retrieve(studentName);
        if (retStudent == null) {
            return -1;
        }

        TMSDate studentJoined = retStudent.getDateJoined();
        retVal = studentJoined.calculateDifference(dateFormed);

        return retVal;
    }

}
