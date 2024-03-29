package ch.demo.dom;

import javax.xml.bind.annotation.XmlEnum;

/**
 * Describes the discipline, the student studies.
 * 
 * @author hostettler
 */
@XmlEnum(String.class)
public enum Discipline {
    /** Maths. */
    MATHEMATICS("Mathematics"),
    /** Biology. */
    BIOLOGY("Biology"),
    /** French. */
    FRENCH("French"),
    /** English. */
    ENGLISH("English"),
    /** German. */
    GERMAN("German"),
    /** History. */

    HISTORY("History"),
    /** Geography. */
    GEOGRAPHY("Geography");

    /**
     * Constructor.
     * 
     * @param name
     *            of the discipline.
     */
    private Discipline(final String name) {
        this.mName = name;
    }

    /** The actual name of the discipline. */
    private String mName;

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return this.mName;
    }

}
