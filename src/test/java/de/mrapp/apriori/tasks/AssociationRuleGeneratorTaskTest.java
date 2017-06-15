/*
 * Copyright 2017 Michael Rapp
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package de.mrapp.apriori.tasks;

import de.mrapp.apriori.Apriori.Configuration;
import de.mrapp.apriori.modules.AssociationRuleGeneratorModule;
import org.junit.Test;

/**
 * Tests the functionality of the class {@link AssociationRuleGeneratorTask}.
 *
 * @author Michael Rapp
 */
public class AssociationRuleGeneratorTaskTest {

    /**
     * Ensures, that an {@link IllegalArgumentException} is thrown by the constructor, which expects
     * a configuration as a parameter, if the configuration is null.
     */
    @Test(expected = IllegalArgumentException.class)
    public final void testConstructorWithConfigurationParameterThrowsException() {
        new AssociationRuleGeneratorTask<>(null);
    }

    /**
     * Ensures, that an {@link IllegalArgumentException} is thrown by the constructor, which expects
     * a configuration and an association rule generator as parameters, if the configuration is
     * null.
     */
    @Test(expected = IllegalArgumentException.class)
    public final void testConstructorWithConfigurationAndAssociationRuleGeneratorParameterThrowsExceptionWhenConfigurationIsNull() {
        new AssociationRuleGeneratorTask<>(null, new AssociationRuleGeneratorModule<>());
    }

    /**
     * Ensures, that an {@link IllegalArgumentException} is thrown by the constructor, which expects
     * a configuration and an association rule generator as parameters, if the association rule
     * generator is null.
     */
    @Test(expected = IllegalArgumentException.class)
    public final void testConstructorWithConfigurationAndAssociationRuleGeneratorParameterThrowsExceptionWhenAssociationRuleGeneratorIsNull() {
        new AssociationRuleGeneratorTask<>(new Configuration(), null);
    }

    /**
     * Tests the functionality of the method, which allows to generate a specific number of
     * association rules.
     */
    @Test
    public final void testGenerateAssociationRules() {
        // TODO: Implement
    }

    /**
     * Tests the functionality of the method, which allows to generate a specific number of
     * association rules, if no specific number of association rules should be found.
     */
    @Test
    public final void testGenerateAssociationRulesWhenRuleCountIsZero() {
        // TODO: Implement
    }

}