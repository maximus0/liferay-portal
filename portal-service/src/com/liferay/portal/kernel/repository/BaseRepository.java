/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.kernel.repository;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.util.UnicodeProperties;
import com.liferay.portal.service.CompanyLocalService;
import com.liferay.portal.service.RepositoryEntryLocalService;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portlet.asset.service.AssetEntryLocalService;
import com.liferay.portlet.documentlibrary.service.DLAppHelperLocalService;
import com.liferay.portlet.documentlibrary.service.DLFolderLocalService;

/**
 * @author Mika Koivisto
 */
public interface BaseRepository extends Repository {

	public LocalRepository getLocalRepository();

	public String[] getSupportedConfigurations();

	public String[][] getSupportedParameters();

	public void initRepository() throws PortalException;

	public void setAssetEntryLocalService(
		AssetEntryLocalService assetEntryLocalService);

	public void setCompanyId(long companyId);

	public void setCompanyLocalService(CompanyLocalService companyLocalService);

	public void setDLAppHelperLocalService(
		DLAppHelperLocalService dlAppHelperLocalService);

	public void setDLFolderLocalService(
		DLFolderLocalService dlFolderLocalService);

	public void setGroupId(long groupId);

	public void setRepositoryEntryLocalService(
		RepositoryEntryLocalService repositoryEntryLocalService);

	public void setRepositoryId(long repositoryId);

	public void setTypeSettingsProperties(
		UnicodeProperties typeSettingsProperties);

	public void setUserLocalService(UserLocalService userLocalService);

}