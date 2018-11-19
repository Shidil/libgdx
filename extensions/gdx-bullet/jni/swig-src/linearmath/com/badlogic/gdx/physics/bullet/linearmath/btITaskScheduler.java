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

public class btITaskScheduler extends BulletBase {
	private long swigCPtr;
	
	protected btITaskScheduler(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btITaskScheduler, normally you should not need this constructor it's intended for low-level usage. */ 
	public btITaskScheduler(long cPtr, boolean cMemoryOwn) {
		this("btITaskScheduler", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btITaskScheduler obj) {
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
				LinearMathJNI.delete_btITaskScheduler(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public String getName() {
    return LinearMathJNI.btITaskScheduler_getName(swigCPtr, this);
  }

  public int getMaxNumThreads() {
    return LinearMathJNI.btITaskScheduler_getMaxNumThreads(swigCPtr, this);
  }

  public int getNumThreads() {
    return LinearMathJNI.btITaskScheduler_getNumThreads(swigCPtr, this);
  }

  public void setNumThreads(int numThreads) {
    LinearMathJNI.btITaskScheduler_setNumThreads(swigCPtr, this, numThreads);
  }

  public void parallelFor(int iBegin, int iEnd, int grainSize, btIParallelForBody body) {
    LinearMathJNI.btITaskScheduler_parallelFor(swigCPtr, this, iBegin, iEnd, grainSize, btIParallelForBody.getCPtr(body), body);
  }

  public void activate() {
    LinearMathJNI.btITaskScheduler_activate(swigCPtr, this);
  }

  public void deactivate() {
    LinearMathJNI.btITaskScheduler_deactivate(swigCPtr, this);
  }

}
