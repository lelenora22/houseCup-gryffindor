package org.generation.italy.houseCup.viewModels;

import java.util.List;

public class ChooseClassViewModel{
    private long courseId;
    private List<CourseSelectViewModel> courseOptions;

    public ChooseClassViewModel(){}

    public ChooseClassViewModel(long courseId, List<CourseSelectViewModel> courseOptions) {
        this.courseId = courseId;
        this.courseOptions = courseOptions;
    }

    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    public List<CourseSelectViewModel> getCourseOptions() {
        return courseOptions;
    }

    public void setCourseOptions(List<CourseSelectViewModel> courseOptions) {
        this.courseOptions = courseOptions;
    }
}
