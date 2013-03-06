/*
 * Copyright 2012 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.planner.config;

import org.drools.planner.config.solver.SolverConfig;
import org.optaplanner.core.Solver;

/**
 * Builds a {@link Solver}.
 * @see XmlSolverFactory
 */
public interface SolverFactory {

    /**
     * Allows you to problematically change the {@link SolverConfig} at runtime before building the {@link Solver}.
     * @return never null
     */
    SolverConfig getSolverConfig();

    /**
     * Creates a new {@link Solver} instance.
     * @return never null
     */
    Solver buildSolver();

}
