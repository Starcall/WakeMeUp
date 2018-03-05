public class Alarm {
    private String eventDayOfTheWeek;
    private String eventTimeOfTheDay;

    public Alarm(String eventDayOfTheWeek, String eventTimeOfTheDay) {
        this.eventDayOfTheWeek = eventDayOfTheWeek;
        this.eventTimeOfTheDay = eventTimeOfTheDay;
    }

    public String getEvent() {
        return eventDayOfTheWeek + " " + eventTimeOfTheDay;
    }
}
