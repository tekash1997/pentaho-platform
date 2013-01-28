/*
 * This program is free software; you can redistribute it and/or modify it under the 
 * terms of the GNU Lesser General Public License, version 2.1 as published by the Free Software 
 * Foundation.
 *
 * You should have received a copy of the GNU Lesser General Public License along with this 
 * program; if not, you can obtain a copy at http://www.gnu.org/licenses/old-licenses/lgpl-2.1.html 
 * or from the Free Software Foundation, Inc., 
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; 
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * Copyright 2006 - 2008 Pentaho Corporation.  All rights reserved.
 *
 * Created Sep 8, 2006 
 * @author wseyler
 */

package org.pentaho.platform.api.engine;

/**
 * @author wseyler
 * Interface for logoutout listeners.  These get called to invalidate
 * caches or other session based items and to perform any additional
 * cleanup or actions required when a user goes away
 */
public interface ILogoutListener {

  /**
   * @param session
   * Performs any logout actions based on this session.
   */
  public void onLogout(IPentahoSession session);
}
