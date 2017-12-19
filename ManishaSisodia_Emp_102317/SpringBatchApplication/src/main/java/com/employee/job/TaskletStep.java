//package com.employee.job;
//
//import org.springframework.batch.core.StepContribution;
//import org.springframework.batch.core.scope.context.ChunkContext;
//import org.springframework.batch.core.step.tasklet.Tasklet;
//import org.springframework.batch.repeat.RepeatStatus;
//import org.springframework.beans.factory.InitializingBean;
//
//public class TaskletStep implements Tasklet,InitializingBean {
//
//		@Override
//		public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
//			// TODO Auto-generated method stub
//			System.out.println("In Tasklet");
//			 final String  SQL_DELETE_BATCH_STEP_EXECUTION_CONTEXT = "DELETE FROM %PREFIX%STEP_EXECUTION_CONTEXT WHERE STEP_EXECUTION_ID IN (SELECT STEP_EXECUTION_ID FROM %PREFIX%STEP_EXECUTION WHERE JOB_EXECUTION_ID IN (SELECT JOB_EXECUTION_ID FROM  %PREFIX%JOB_EXECUTION where CREATE_TIME < ?))";
//			   final String  SQL_DELETE_BATCH_STEP_EXECUTION         = "DELETE FROM %PREFIX%STEP_EXECUTION WHERE JOB_EXECUTION_ID IN (SELECT JOB_EXECUTION_ID FROM %PREFIX%JOB_EXECUTION where CREATE_TIME < ?)";
//			    final String  SQL_DELETE_BATCH_JOB_EXECUTION_CONTEXT  = "DELETE FROM %PREFIX%JOB_EXECUTION_CONTEXT WHERE JOB_EXECUTION_ID IN (SELECT JOB_EXECUTION_ID FROM  %PREFIX%JOB_EXECUTION where CREATE_TIME < ?)";
//			    final String  SQL_DELETE_BATCH_JOB_EXECUTION_PARAMS   = "DELETE FROM %PREFIX%JOB_EXECUTION_PARAMS WHERE JOB_EXECUTION_ID IN (SELECT JOB_EXECUTION_ID FROM %PREFIX%JOB_EXECUTION where CREATE_TIME < ?)";
//			    final String  SQL_DELETE_BATCH_JOB_EXECUTION          = "DELETE FROM %PREFIX%JOB_EXECUTION where CREATE_TIME < ?";
//			   final String  SQL_DELETE_BATCH_JOB_INSTANCE           = "DELETE FROM %PREFIX%JOB_INSTANCE WHERE JOB_INSTANCE_ID NOT IN (SELECT JOB_INSTANCE_ID FROM %PREFIX%JOB_EXECUTION)";
//			return null;
//	
//		}
//
////			public class RemoveSpringBatchHistoryTasklet implements Tasklet, InitializingBean {
//		
//
//
//			
//			/**
//			     * SQL statements removing step and job executions compared to a given date.
//			     */
//
//			
//			   
//
//		@Override
//		public void afterPropertiesSet() throws Exception {
//			System.out.println("In afterPropertiesSet");
//			
//			
//		}
//
//}
//
