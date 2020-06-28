package at.gusenbauer.taskycompanion.dataclasses;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;


@XmlRootElement(name = "activities")
public class ActivityListWrapper {
    public ActivityListWrapper() {
    }

    private List<Activity> activities;

    @XmlElement(name = "activity")
    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(final List<Activity> activities) {
        this.activities = activities;
    }
}