/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
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

package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author Brian Wing Shun Chan
 */
public class GroupFinderUtil {
	public static int countByKeywords(long companyId, long parentGroupId,
		java.lang.String parentGroupIdComparator, java.lang.String keywords,
		java.util.LinkedHashMap<java.lang.String, java.lang.Object> params)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countByKeywords(companyId, parentGroupId,
			parentGroupIdComparator, keywords, params);
	}

	public static int countByKeywords(long companyId, long[] classNameIds,
		long parentGroupId, java.lang.String parentGroupIdComparator,
		java.lang.String keywords,
		java.util.LinkedHashMap<java.lang.String, java.lang.Object> params)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countByKeywords(companyId, classNameIds, parentGroupId,
			parentGroupIdComparator, keywords, params);
	}

	public static int countByKeywords(long companyId, long[] classNameIds,
		java.lang.String keywords,
		java.util.LinkedHashMap<java.lang.String, java.lang.Object> params)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countByKeywords(companyId, classNameIds, keywords, params);
	}

	public static int countByKeywords(long companyId,
		java.lang.String keywords,
		java.util.LinkedHashMap<java.lang.String, java.lang.Object> params)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().countByKeywords(companyId, keywords, params);
	}

	public static int countByLayouts(long companyId, long parentGroupId,
		boolean site)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().countByLayouts(companyId, parentGroupId, site);
	}

	public static int countByG_U(long groupId, long userId, boolean inherit)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().countByG_U(groupId, userId, inherit);
	}

	public static int countByC_N_D(long companyId, java.lang.String name,
		java.lang.String realName, java.lang.String description,
		java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
		boolean andOperator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countByC_N_D(companyId, name, realName, description,
			params, andOperator);
	}

	public static int countByC_N_D(long companyId, java.lang.String[] names,
		java.lang.String[] realNames, java.lang.String[] descriptions,
		java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
		boolean andOperator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countByC_N_D(companyId, names, realNames, descriptions,
			params, andOperator);
	}

	public static int countByC_C_N_D(long companyId, long[] classNameIds,
		java.lang.String name, java.lang.String realName,
		java.lang.String description,
		java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
		boolean andOperator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countByC_C_N_D(companyId, classNameIds, name, realName,
			description, params, andOperator);
	}

	public static int countByC_PG_N_D(long companyId, long parentGroupId,
		java.lang.String parentGroupIdComparator, java.lang.String name,
		java.lang.String realName, java.lang.String description,
		java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
		boolean andOperator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countByC_PG_N_D(companyId, parentGroupId,
			parentGroupIdComparator, name, realName, description, params,
			andOperator);
	}

	public static int countByC_PG_N_D(long companyId, long parentGroupId,
		java.lang.String parentGroupIdComparator, java.lang.String[] names,
		java.lang.String[] realNames, java.lang.String[] descriptions,
		java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
		boolean andOperator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countByC_PG_N_D(companyId, parentGroupId,
			parentGroupIdComparator, names, realNames, descriptions, params,
			andOperator);
	}

	public static int countByC_C_PG_N_D(long companyId, long[] classNameIds,
		long parentGroupId, java.lang.String parentGroupIdComparator,
		java.lang.String name, java.lang.String realName,
		java.lang.String description,
		java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
		boolean andOperator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countByC_C_PG_N_D(companyId, classNameIds, parentGroupId,
			parentGroupIdComparator, name, realName, description, params,
			andOperator);
	}

	public static int countByC_C_PG_N_D(long companyId, long[] classNameIds,
		long parentGroupId, java.lang.String parentGroupIdComparator,
		java.lang.String[] names, java.lang.String[] realNames,
		java.lang.String[] descriptions,
		java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
		boolean andOperator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countByC_C_PG_N_D(companyId, classNameIds, parentGroupId,
			parentGroupIdComparator, names, realNames, descriptions, params,
			andOperator);
	}

	public static java.util.List<com.liferay.portal.model.Group> findByKeywords(
		long companyId, long parentGroupId,
		java.lang.String parentGroupIdComparator, java.lang.String keywords,
		java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
		int start, int end, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findByKeywords(companyId, parentGroupId,
			parentGroupIdComparator, keywords, params, start, end, obc);
	}

	public static java.util.List<com.liferay.portal.model.Group> findByKeywords(
		long companyId, long[] classNameIds, long parentGroupId,
		java.lang.String parentGroupIdComparator, java.lang.String keywords,
		java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
		int start, int end, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findByKeywords(companyId, classNameIds, parentGroupId,
			parentGroupIdComparator, keywords, params, start, end, obc);
	}

	public static java.util.List<com.liferay.portal.model.Group> findByKeywords(
		long companyId, long[] classNameIds, java.lang.String keywords,
		java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
		int start, int end, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findByKeywords(companyId, classNameIds, keywords, params,
			start, end, obc);
	}

	public static java.util.List<com.liferay.portal.model.Group> findByKeywords(
		long companyId, java.lang.String keywords,
		java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
		int start, int end, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findByKeywords(companyId, keywords, params, start, end, obc);
	}

	public static java.util.List<com.liferay.portal.model.Group> findByLayouts(
		long companyId, long parentGroupId, boolean site, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findByLayouts(companyId, parentGroupId, site, start, end);
	}

	public static java.util.List<com.liferay.portal.model.Group> findByLiveGroups()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findByLiveGroups();
	}

	public static java.util.List<com.liferay.portal.model.Group> findByNoLayouts(
		long classNameId, boolean privateLayout, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findByNoLayouts(classNameId, privateLayout, start, end);
	}

	public static java.util.List<com.liferay.portal.model.Group> findByNullFriendlyURL()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findByNullFriendlyURL();
	}

	public static java.util.List<com.liferay.portal.model.Group> findBySystem(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findBySystem(companyId);
	}

	public static java.util.List<com.liferay.portal.model.Group> findByCompanyId(
		long companyId,
		java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
		int start, int end, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findByCompanyId(companyId, params, start, end, obc);
	}

	public static com.liferay.portal.model.Group findByC_N(long companyId,
		java.lang.String name)
		throws com.liferay.portal.NoSuchGroupException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findByC_N(companyId, name);
	}

	public static java.util.List<com.liferay.portal.model.Group> findByC_N_D(
		long companyId, java.lang.String name, java.lang.String realName,
		java.lang.String description,
		java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
		boolean andOperator, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findByC_N_D(companyId, name, realName, description, params,
			andOperator, start, end, obc);
	}

	public static java.util.List<com.liferay.portal.model.Group> findByC_N_D(
		long companyId, java.lang.String[] names, java.lang.String[] realNames,
		java.lang.String[] descriptions,
		java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
		boolean andOperator, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findByC_N_D(companyId, names, realNames, descriptions,
			params, andOperator, start, end, obc);
	}

	public static java.util.List<com.liferay.portal.model.Group> findByC_C_N_D(
		long companyId, long[] classNameIds, java.lang.String name,
		java.lang.String realName, java.lang.String description,
		java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
		boolean andOperator, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findByC_C_N_D(companyId, classNameIds, name, realName,
			description, params, andOperator, start, end, obc);
	}

	public static java.util.List<com.liferay.portal.model.Group> findByC_PG_N_D(
		long companyId, long parentGroupId,
		java.lang.String parentGroupIdComparator, java.lang.String name,
		java.lang.String realName, java.lang.String description,
		java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
		boolean andOperator, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findByC_PG_N_D(companyId, parentGroupId,
			parentGroupIdComparator, name, realName, description, params,
			andOperator, start, end, obc);
	}

	public static java.util.List<com.liferay.portal.model.Group> findByC_PG_N_D(
		long companyId, long parentGroupId,
		java.lang.String parentGroupIdComparator, java.lang.String[] names,
		java.lang.String[] realNames, java.lang.String[] descriptions,
		java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
		boolean andOperator, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findByC_PG_N_D(companyId, parentGroupId,
			parentGroupIdComparator, names, realNames, descriptions, params,
			andOperator, start, end, obc);
	}

	public static java.util.List<com.liferay.portal.model.Group> findByC_C_PG_N_D(
		long companyId, long[] classNameIds, long parentGroupId,
		java.lang.String parentGroupIdComparator, java.lang.String name,
		java.lang.String realName, java.lang.String description,
		java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
		boolean andOperator, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findByC_C_PG_N_D(companyId, classNameIds, parentGroupId,
			parentGroupIdComparator, name, realName, description, params,
			andOperator, start, end, obc);
	}

	public static java.util.List<com.liferay.portal.model.Group> findByC_C_PG_N_D(
		long companyId, long[] classNameIds, long parentGroupId,
		java.lang.String parentGroupIdComparator, java.lang.String[] names,
		java.lang.String[] realNames, java.lang.String[] descriptions,
		java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
		boolean andOperator, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findByC_C_PG_N_D(companyId, classNameIds, parentGroupId,
			parentGroupIdComparator, names, realNames, descriptions, params,
			andOperator, start, end, obc);
	}

	public static GroupFinder getFinder() {
		if (_finder == null) {
			_finder = (GroupFinder)PortalBeanLocatorUtil.locate(GroupFinder.class.getName());

			ReferenceRegistry.registerReference(GroupFinderUtil.class, "_finder");
		}

		return _finder;
	}

	public void setFinder(GroupFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(GroupFinderUtil.class, "_finder");
	}

	private static GroupFinder _finder;
}