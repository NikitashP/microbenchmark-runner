/*
 * Copyright 2018 the original author or authors.
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
package jmh.mbr.junit5.discovery.predicates;

import java.lang.reflect.Method;
import java.util.function.Predicate;

import org.openjdk.jmh.annotations.Benchmark;

/**
 * {@link Predicate} to check whether a {@link Method} is a {@code @Benchmark} method.
 * 
 * @author Mark Paluch
 * @see IsBenchmarkClass
 */
public enum IsBenchmarkMethod implements Predicate<Method> {

	INSTANCE;

	@Override
	public boolean test(Method theMethod) {
		return theMethod.isAnnotationPresent(Benchmark.class);
	}
}
