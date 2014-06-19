/**
 * 
 */
package org.greenscape.site.service;

import java.util.Collection;

import org.greenscape.core.service.Service;
import org.greenscape.site.Site;

/**
 * @author Sheikh Sajid
 * 
 */
public interface SiteService extends Service {

	Site findBySiteId(String siteId);

	Collection<Site> findByOrganizationId(String orgId);

	Site save(Site site);

	void deleteBySiteId(String siteId);

	void deletePage(String siteId, String pageId);

}
