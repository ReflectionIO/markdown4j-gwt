/**
 * Copyright 2005-2010 Noelios Technologies.
 * 
 * The contents of this file are subject to the terms of one of the following
 * open source licenses: LGPL 3.0 or LGPL 2.1 or CDDL 1.0 or EPL 1.0 (the
 * "Licenses"). You can select the license that you prefer but you may not use
 * this file except in compliance with one of these Licenses.
 * 
 * You can obtain a copy of the LGPL 3.0 license at
 * http://www.opensource.org/licenses/lgpl-3.0.html
 * 
 * You can obtain a copy of the LGPL 2.1 license at
 * http://www.opensource.org/licenses/lgpl-2.1.php
 * 
 * You can obtain a copy of the CDDL 1.0 license at
 * http://www.opensource.org/licenses/cddl1.php
 * 
 * You can obtain a copy of the EPL 1.0 license at
 * http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * See the Licenses for the specific language governing permissions and
 * limitations under the Licenses.
 * 
 * Alternatively, you can obtain a royalty free commercial license with less
 * limitations, transferable or non-transferable, directly at
 * http://www.noelios.com/products/restlet-engine
 * 
 * Restlet is a registered trademark of Noelios Technologies.
 */

package java.util.logging;

/**
 * Emulate the Level class, especially for the GWT module.
 * 
 * @author Thierry Boileau
 * 
 */
public class Level {

    public static final Level ALL = new Level("ALL", Integer.MIN_VALUE);

    public static final Level CONFIG = new Level("CONFIG", 700);

    public static final Level FINE = new Level("FINE", 500);

    public static final Level FINER = new Level("FINER", 400);

    public static final Level FINEST = new Level("FINEST", 300);

    public static final Level INFO = new Level("INFO", 800);

    public static final Level OFF = new Level("OFF", Integer.MAX_VALUE);

    public static final Level SEVERE = new Level("SEVERE", 1000);

    public static final Level WARNING = new Level("WARNING", 900);

    private String name;

    private int value;

    public Level(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public boolean equals(Object obj) {
        try {
            Level level = (Level) obj;
            return level.value == this.value;
        } catch (Exception e) {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public int hashCode() {
        return this.value;
    }
    
}
