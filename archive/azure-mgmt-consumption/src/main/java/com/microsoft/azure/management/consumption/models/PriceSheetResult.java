/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package consumption.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * An pricesheet resource.
 */
@JsonFlatten
public class PriceSheetResult extends Resource {
    /**
     * Price sheet.
     */
    @JsonProperty(value = "properties.pricesheets", access = JsonProperty.Access.WRITE_ONLY)
    private List<PriceSheetProperties> pricesheets;

    /**
     * The link (url) to the next page of results.
     */
    @JsonProperty(value = "properties.nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the pricesheets value.
     *
     * @return the pricesheets value
     */
    public List<PriceSheetProperties> pricesheets() {
        return this.pricesheets;
    }

    /**
     * Get the nextLink value.
     *
     * @return the nextLink value
     */
    public String nextLink() {
        return this.nextLink;
    }

}
