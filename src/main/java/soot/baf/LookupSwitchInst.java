/* Soot - a J*va Optimization Framework
 * Copyright (C) 1999 Patrick Lam, Patrick Pominville and Raja Vallee-Rai
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the
 * Free Software Foundation, Inc., 59 Temple Place - Suite 330,
 * Boston, MA 02111-1307, USA.
 */

/*
 * Modified by the Sable Research Group and others 1997-1999.  
 * See the 'credits' file distributed with Soot for the complete list of
 * contributors.  (Soot is distributed at http://www.sable.mcgill.ca/soot)
 */

package soot.baf;

import java.util.List;

import soot.Unit;
import soot.UnitBox;
import soot.jimple.IntConstant;

public interface LookupSwitchInst extends Inst {
  public Unit getDefaultTarget();

  public void setDefaultTarget(Unit defTarget);

  public UnitBox getDefaultTargetBox();

  public void setLookupValue(int index, int value);

  public int getLookupValue(int index);

  public List<IntConstant> getLookupValues();

  public void setLookupValues(List<IntConstant> values);

  public int getTargetCount();

  public Unit getTarget(int index);

  public UnitBox getTargetBox(int index);

  public void setTarget(int index, Unit target);

  public List<Unit> getTargets();

  public void setTargets(List<Unit> targets);
}
