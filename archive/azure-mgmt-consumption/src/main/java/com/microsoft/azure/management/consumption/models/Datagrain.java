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
 * Defines values for Datagrain.
 */
public final class Datagrain extends ExpandableStringEnum<Datagrain> {
    /** Static value daily for Datagrain. */
    public static final Datagrain DAILY_GRAIN = fromString("daily");

    /** Static value monthly for Datagrain. */
    public static final Datagrain MONTHLY_GRAIN = fromString("monthly");

    /**
     * Creates or finds a Datagrain from its string representation.
     * @param name a name to look for
     * @return the corresponding Datagrain
     */
    @JsonCreator
    public static Datagrain fromString(String name) {
        return fromString(name, Datagrain.class);
    }

    /**
     * @return known Datagrain values
     */
    public static Collection<Datagrain> values() {
        return values(Datagrain.class);
    }
}
