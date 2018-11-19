/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.linearmath;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btSymmetricSpatialDyad extends BulletBase {
	private long swigCPtr;
	
	protected btSymmetricSpatialDyad(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btSymmetricSpatialDyad, normally you should not need this constructor it's intended for low-level usage. */ 
	public btSymmetricSpatialDyad(long cPtr, boolean cMemoryOwn) {
		this("btSymmetricSpatialDyad", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btSymmetricSpatialDyad obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				LinearMathJNI.delete_btSymmetricSpatialDyad(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setTopLeftMat(btMatrix3x3 value) {
    LinearMathJNI.btSymmetricSpatialDyad_topLeftMat_set(swigCPtr, this, btMatrix3x3.getCPtr(value), value);
  }

  public btMatrix3x3 getTopLeftMat() {
    long cPtr = LinearMathJNI.btSymmetricSpatialDyad_topLeftMat_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btMatrix3x3(cPtr, false);
  }

  public void setTopRightMat(btMatrix3x3 value) {
    LinearMathJNI.btSymmetricSpatialDyad_topRightMat_set(swigCPtr, this, btMatrix3x3.getCPtr(value), value);
  }

  public btMatrix3x3 getTopRightMat() {
    long cPtr = LinearMathJNI.btSymmetricSpatialDyad_topRightMat_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btMatrix3x3(cPtr, false);
  }

  public void setBottomLeftMat(btMatrix3x3 value) {
    LinearMathJNI.btSymmetricSpatialDyad_bottomLeftMat_set(swigCPtr, this, btMatrix3x3.getCPtr(value), value);
  }

  public btMatrix3x3 getBottomLeftMat() {
    long cPtr = LinearMathJNI.btSymmetricSpatialDyad_bottomLeftMat_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btMatrix3x3(cPtr, false);
  }

  public btSymmetricSpatialDyad() {
    this(LinearMathJNI.new_btSymmetricSpatialDyad__SWIG_0(), true);
  }

  public btSymmetricSpatialDyad(Matrix3 topLeftMat, Matrix3 topRightMat, Matrix3 bottomLeftMat) {
    this(LinearMathJNI.new_btSymmetricSpatialDyad__SWIG_1(topLeftMat, topRightMat, bottomLeftMat), true);
  }

  public void setMatrix(Matrix3 topLeftMat, Matrix3 topRightMat, Matrix3 bottomLeftMat) {
    LinearMathJNI.btSymmetricSpatialDyad_setMatrix(swigCPtr, this, topLeftMat, topRightMat, bottomLeftMat);
  }

  public void addMatrix(Matrix3 topLeftMat, Matrix3 topRightMat, Matrix3 bottomLeftMat) {
    LinearMathJNI.btSymmetricSpatialDyad_addMatrix(swigCPtr, this, topLeftMat, topRightMat, bottomLeftMat);
  }

  public void setIdentity() {
    LinearMathJNI.btSymmetricSpatialDyad_setIdentity(swigCPtr, this);
  }

  public btSymmetricSpatialDyad operatorSubtractionAssignment(btSymmetricSpatialDyad mat) {
    return new btSymmetricSpatialDyad(LinearMathJNI.btSymmetricSpatialDyad_operatorSubtractionAssignment(swigCPtr, this, btSymmetricSpatialDyad.getCPtr(mat), mat), false);
  }

  public btSpatialForceVector operatorMultiplication(btSpatialMotionVector vec) {
    return new btSpatialForceVector(LinearMathJNI.btSymmetricSpatialDyad_operatorMultiplication(swigCPtr, this, btSpatialMotionVector.getCPtr(vec), vec), true);
  }

}
