/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package consumption.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for TimeGrainType.
 */
public final class TimeGrainType extends ExpandableStringEnum<TimeGrainType> {
    /** Static value Monthly for TimeGrainType. */
    public static final TimeGrainType MONTHLY = fromString("Monthly");

    /** Static value Quarterly for TimeGrainType. */
    public static final TimeGrainType QUARTERLY = fromString("Quarterly");

    /** Static value Annually for TimeGrainType. */
    public static final TimeGrainType ANNUALLY = fromString("Annually");

    /**
     * Creates or finds a TimeGrainType from its string representation.
     * @param name a name to look for
     * @return the corresponding TimeGrainType
     */
    @JsonCreator
    public static TimeGrainType fromString(String name) {
        return fromString(name, TimeGrainType.class);
    }

    /**
     * @return known TimeGrainType values
     */
    public static Collection<TimeGrainType> values() {
        return values(TimeGrainType.class);
    }
}
