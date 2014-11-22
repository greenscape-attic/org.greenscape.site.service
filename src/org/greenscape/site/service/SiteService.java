/**
 *
 */
package org.greenscape.site.service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.greenscape.core.model.SiteModel;

/**
 * @author Sheikh Sajid
 *
 */
public interface SiteService {

	Collection<SiteModel> findByOrganizationId(String orgId);

	void deletePage(String siteId, String pageId);

	List<SiteModel> find();

	SiteModel find(String siteId);

	List<SiteModel> find(Map<String, List<String>> properties);

	List<SiteModel> find(String propertyName, Object value);

	SiteModel save(SiteModel model);

	SiteModel update(SiteModel model);

	void delete();

	void delete(String id);

}
