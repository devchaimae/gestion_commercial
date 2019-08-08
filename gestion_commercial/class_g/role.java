/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_commercial.class_g;

import java.util.Date;

/**
 *
 * @author didiy
 */
public class role {
    private int id;
    private String name;
    private String  display_name;
    private String  description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public role(int id, String name, String display_name, String description) {
        this.id = id;
        this.name = name;
        this.display_name = display_name;
        this.description = description;
    }
   
}
