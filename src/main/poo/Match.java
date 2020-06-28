public class Match {
    private String datetime;
    private League league;
    private Team local;
    private Team visitor;
    private Integer localStore;
    private Integer visitorStore;

    public Match(String datetime, League league, Team local, Team visitor, Integer localStore, Integer visitorStore) {
        this.datetime = datetime;
        this.league = league;
        this.local = local;
        this.visitor = visitor;
        this.localStore = localStore;
        this.visitorStore = visitorStore;
    }

    public String getDatetime() {
        return datetime;
    }

    public League getLeague() {
        return league;
    }

    public Team getLocal() {
        return local;
    }

    public Team getVisitor() {
        return visitor;
    }

    public Integer getLocalStore() {
        return localStore;
    }

    public Integer getVisitorStore() {
        return visitorStore;
    }
}
