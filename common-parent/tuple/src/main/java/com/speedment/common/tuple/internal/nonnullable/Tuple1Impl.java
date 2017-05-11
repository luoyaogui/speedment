/**
 * 
 * Copyright (c) 2006-2017, Speedment, Inc. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); You may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at: 
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.speedment.common.tuple.internal.nonnullable;

import com.speedment.common.tuple.Tuple1;
import com.speedment.common.tuple.Tuple;
import com.speedment.common.tuple.internal.AbstractTuple;

/**
 * An implementation class of a {@link Tuple1 }
 * 
 * @param <T0> type of element 0
 * 
 * @author Per Minborg
 */
public final class Tuple1Impl<T0> extends AbstractTuple implements Tuple1<T0> {
    
    /**
     * Constructs a {@link Tuple } of type {@link Tuple1 }.
     * 
     * @param e0 element 0
     */
    public Tuple1Impl(T0 e0) {
        super(Tuple1Impl.class, e0);
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public T0 get0() {
        return ((T0) values[0]);
    }
}