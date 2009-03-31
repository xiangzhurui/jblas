// --- BEGIN LICENSE BLOCK ---
/* 
 * Copyright (c) 2009, Mikio L. Braun
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 * 
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 * 
 *     * Redistributions in binary form must reproduce the above
 *       copyright notice, this list of conditions and the following
 *       disclaimer in the documentation and/or other materials provided
 *       with the distribution.
 * 
 *     * Neither the name of the Technische Universität Berlin nor the
 *       names of its contributors may be used to endorse or promote
 *       products derived from this software without specific prior
 *       written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
// --- END LICENSE BLOCK ---

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jblas.la;

import org.jblas.la.SimpleBlas;
import org.jblas.la.DoubleMatrix;
import junit.framework.TestCase;

/**
 *
 * @author mikio
 */
public class SimpleBlasTest extends TestCase {
    
    public SimpleBlasTest(String testName) {
        super(testName);
    }

    public void testGeev() {
        DoubleMatrix A = new DoubleMatrix(2, 2, 3.0, -3.0, 1.0, 1.0);
        DoubleMatrix WR = new DoubleMatrix(2);
        DoubleMatrix WI = new DoubleMatrix(2);
        DoubleMatrix VR = new DoubleMatrix(2,2);
        DoubleMatrix VL = new DoubleMatrix(2,2);
        
        SimpleBlas.geev('V', 'N', A, WR, WI, VR, VL);
        
        assertEquals(new DoubleMatrix(2, 1, 2.0, 2.0), WR);
        assertEquals(new DoubleMatrix(2, 1, Math.sqrt(2.0), -Math.sqrt(2.0)), WI);
        
        System.out.printf("WR = %s\n", WR.toString());
        System.out.printf("WI = %s\n", WI.toString());
        System.out.printf("VR = %s\n", VR.toString());
        System.out.printf("VL = %s\n", VL.toString());
        System.out.printf("A = %s\n", A.toString());
        
    }
}