/*
 * Copyright (C) 2003-2011 eXo Platform SAS.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Affero General Public License
 * as published by the Free Software Foundation; either version 3
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, see<http://www.gnu.org/licenses/>.
 */
package org.exoplatform.samples.scheduler.jobs;

import org.exoplatform.services.log.ExoLogger;
import org.exoplatform.services.log.Log;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * DumbJob for executing a defined dumb job.

 * @author <a href="http://hoatle.net">hoatle (hoatlevan at gmail dot com)</a>
 * @since Jan 18, 2011
 */
public class DumbJob implements Job {

  /**
   * The logger
   */
  private static final Log LOG = ExoLogger.getLogger(DumbJob.class);

  /**
   * The job of the DumbJob will be done by executing this method.
   *
   * @param context
   * @throws JobExecutionException
   */
  public void execute(JobExecutionContext context) throws JobExecutionException {
    LOG.info("DumbJob is executing...");
  }
}
