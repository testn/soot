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

package soot.baf.internal;

import soot.AbstractJasminClass;
import soot.ArrayType;
import soot.NullType;
import soot.RefType;
import soot.Type;
import soot.UnitPrinter;
import soot.baf.Baf;

public abstract class AbstractOpTypeInst extends AbstractInst {
  protected Type opType;

  protected AbstractOpTypeInst(Type opType) {
    if (opType instanceof NullType || opType instanceof ArrayType || opType instanceof RefType) {
      opType = RefType.v();
    }

    this.opType = opType;
  }

  public Type getOpType() {
    return opType;
  }

  public void setOpType(Type t) {
    opType = t;
    if (opType instanceof NullType || opType instanceof ArrayType || opType instanceof RefType) {
      opType = RefType.v();
    }
  }

  /* override AbstractInst's toString with our own, including types */
  public String toString() {
    return getName() + "." + Baf.bafDescriptorOf(opType) + getParameters();
  }

  public void toString(UnitPrinter up) {
    up.literal(getName());
    up.literal(".");
    up.literal(Baf.bafDescriptorOf(opType));
    getParameters(up);
  }

  public int getOutMachineCount() {
    return AbstractJasminClass.sizeOfType(getOpType());
  }

}
