package com.schedule.entity;

import lombok.Data;

@Data
public class Preference implements Serializable {
    private String preferId;
    private String employeeId;
    private String preferType;
    private String preferValue;
}
